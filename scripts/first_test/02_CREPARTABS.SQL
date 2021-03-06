set echo on;
/*
alter session set nls_language = english;
alter session set nls_date_format = 'DD-MON-YYYY';
alter session set nls_date_language = english;
*/

/* Changes: 
 *   - Removed HORIZONTAL with VARCHAR in FLUGLINIE
 *   - Replaced HORIZONTAL with VARCHAR to INTEGER in FLUG
 *   - Added constraint UNIQUE to FLUGLINIE
 *   - removed all foreign keys (optional implementation)
 *   - renamed table FLUGHAFEN to FLUHEN8 due to exception ORA-02264
 */

/* [[CREATE ALL TABLES]]*/
create table FLUHEN8 (
FHC varchar(3),
LAND		varchar(3),
STADT	varchar(50),
NAME		varchar(50),
constraint FLUGHAFEN_PS
	primary key (FHC)
);

create table FLUGLINIE (
FLC	varchar(2),
LAND		varchar(3),
HUB		varchar(3),
NAME		varchar(30),
ALLIANZ		varchar(20),
constraint FLUGLINIE_LAND_NN
	check (LAND is not null),
constraint FLUGLINIE_ALLIANZ_CHK
	check (ALLIANZ in ('Star','Excellence','Leftover','OneWorld','SkyTeam')),
constraint FLUGLINIE_PS
	primary key (FLC),
constraint NAME_UNI
	unique (NAME)
);

create table FLUG (
FNR integer,
FLC		varchar(2),
FLNR		integer,		
VON		varchar(3),
NACH		varchar(3),
AB	integer,
AN	integer,
constraint FLUG_VON_NN
	check (VON is not null),
constraint FLUG_NACH_NN
	check (NACH is not null),
constraint FLUG_AB_NN
	check (AB is not null),
constraint FLUG_AN_NN
	check (AN is not null),
constraint FLUG_AB_CHK
	check (AB between 0 and 2400),
constraint FLUG_AN_CHK
	check (AN between 0 and 2400),
constraint FLUG_VONNACH_CHK
	check (VON != NACH),
constraint FLUG_PS
	primary key (FNR)
/* constraint FLUG_FS_FLC
		foreign key (FLC) references FLUGLINIE(FLC),
constraint FLUG_FS_VON
		foreign key (VON) references FLUGHAFEN(FHC),
constraint FLUG_FS_NACH
		foreign key (NACH) references FLUGHAFEN(FHC) */
)
HORIZONTAL (AB(1000,1500));


create table PASSAGIER (
PNR		integer,
NAME		varchar(40),
VORNAME		varchar(40),		
LAND		varchar(3),
constraint PASSAGIER_NAME_NN
  check (NAME is not null),
constraint PASSAGIER_PS
	primary key (PNR)
)
HORIZONTAL (PNR(35,70));


create table BUCHUNG (
BNR integer,
PNR		integer,
FLC		varchar(2),
FLNR		integer,		
VON		varchar(3),
NACH		varchar(3),
TAG		varchar(20),
MEILEN  integer,
PREIS integer,
constraint BUCHUNG_NACH_NN
	check (NACH is not null),
constraint BUCHUNG_MEILEN_NN
	check (MEILEN is not null),
constraint BUCHUNG_PREIS_NN
	check (PREIS is not null),
constraint BUCHUNG_MEILEN_CHK
    check (MEILEN >= 0),
constraint BUCHUNG_PREIS_CHK
    check (PREIS > 0),
constraint BUCHUNG_PS
	primary key (BNR)
/* constraint BUCHUNG_FS_PNR
		foreign key (PNR) references PASSAGIER(PNR),
constraint BUCHUNG_FS_FLC
		foreign key (FLC) references FLUGLINIE(FLC),
constraint BUCHUNG_FS_VON
		foreign key (VON) references FLUGHAFEN(FHC),
constraint BUCHUNG_FS_NACH
		foreign key (NACH) references FLUGHAFEN(FHC) */
)
HORIZONTAL (PNR(35,70));
