Chekori za otvaranje na proekt:

*Kreirate folder nekoj, primer "New folder", potoa desen klik vo folderot i Git Bash Here (prethodno mora da ja simnete od net okolinata git bash), pa potoa ja pishuvate komandata:
git init
potoa komandata:
git pull https://github.com/proekti96/proektdomashnidizajn.git
Dodeka drug nachin e: git clone https://github.com/proekti96/proektdomashnidizajn.git
Na ovoj nachin se simnuva proektot ili tret nachin e direktno Download ZIP;

*Dopolnitelno, za da zemete promeni dokolku ima update od moja strana vo kodot, toa go pravite so naredbata: git pull...

1. Pred da go otvorite proektot kopirajte go na Desktop folderot "dasproekt" kojshto se naogja vo folderot Domashna 3;
(Najdobro e vaka da napravite za da ne se javi nekoj problem dokolku direktno go otvarate, primer zatoa shto folderite "Domashna" se na kirilica i slichno).

2. Potrebno Vi e IntelliJ IDEA 2020.3
Znachi desen klik na folderot i odbirate Open Folder as IntelliJ IDEA PROJECT;

3. Potrebno Vi e XAMPP Control Panel. Go otvarate i aktivirate Apache na start kopcheto, dodeka Tomcat sam se aktivira koga kje se ranuva programata vo IntelliJ. Dopolnitelno go aktivirate i MySQL, dokolku sakate da ja aktivirate celosno aplikacijata so bazata;

4. Otvarate na browser (najdobro na Google Chrome) : 
http://localhost:8080/
http://localhost:8080/home
http://localhost:8080/ProCredit
http://localhost:8080/banks
http://localhost:8080/atms
http://localhost:8080/login
http://localhost:8080/all
http://localhost:8080/contact
http://localhost:8080/register

5. Za bazite koristam XAMPP, pa MySQL, vo kodot gi gledate podatocite za bazata, kako user i pass (i dvete se daniela) i ime na bazata (location_db), potoa vo XAMPP kje otvorite vo delot Admin i vi se otvara stranicata http://localhost/phpmyadmin/
pa vo nea odite na new i kreirate baza so isto ime (location_db), na toj nachin koga kje ja pushtite aplikacijata vo IntelliJ avtomatski kodot go povrzuvate so bazata. Isto vo IntelliJ desno vo Database delot treba refresh da napravite;
Ili mozhe i so import delot na bazite vo folderot data, za dokolku sakate da gi menuvate. Dokolku samo sakate da ja pushtite web stranata potrebno e samo refresh na database delot desno vo Intellij...

6. Dokolku ima problem, potrebno e da kreirate baza location_db i so klik na new pa potoa import kje gi importirate site sql-i edno po edno. Potoa odkoga toa kje go napravite toa, sledno potrebno e vo delot na privileges, vo new, add user account, da kreirate user so ime daniela i password daniela.

7. Dokolku se ova go napravivte i seushte ima nekakov problem, proverete vo kodot vo model -> exceptions -> Location, dali e povrzano so bazata vo ovoj red od kodot "@Table(name="locations")", so klik na ova kje vi se pojavi povrzuvanjeto koeshto e potrebno da go napravite, potoa pak proveruvate dali e se vo red so debug, pa potoa odite na run.

8. Mozhebi da Vi se pojavi prozorche so vnes na username i password za baza (i dvete se "daniela").
I dokolku se e povrzano i uklucheno, aplikacijata kje Vi se pushti uspeshno dokolku na browser vpishete nekoj link od navedenite vo tochka 4.

---------------------------------------------------------------------------------------------------------------------
Dokolku ne vi pomogna objasnuvanjevo i seushte imate problemi pri startuvanje na aplikacijata slobodno kontaktirajte me na e-mail: janushevska.daniela@students.finki.ukim.mk

---------------------------------------------------------------------------------------------------------------------
verzija 1.10