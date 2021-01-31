Objasnuvanje:

1. Aplikacijata od Domashna 3 e Refaktorirana.
(kodot ne sodrzhi greshki, ima celosna zamislena funkcionalnost, izbrishani se nepotrebni kodovi i fajlovi, smetam deka e dobro objasneto so komentari i e podobren kodot vo odnos na chitlivost itn.)

2. API:
http://localhost:8080/api/gradovi
Ovde koristam edno API, koe e kreirano od moja strana. Znachi moe API. Konkretno kodot mozhe da go vidite vo "GradRestController" za toa kako e upotrebeno toa API.
Ovie podatoci jas potoa gi filtriram, za da mozhe posebno so pomosh na id (kluch) vo tabela da se isfiltriraat ekspozituri i bankomati. Dopolnitelno pravam i filtriranje po gradovi.
*Dopolnitelno koristam ushte edno API, mozhe da go poglednete kodot vo "ProCredit.html", tie podatoci se prikacheni na server na GDI firma kade shto odev na praksa i od tamu gi vlecham podatocite so JavaScript kod i JQuery koristam dopolnitelno. Kako i ArcGis kompletot.
http://app.gdi.mk/arcgis/rest/services/Studenti/Bankomati_Ekspozituri/MapServer/1
Na ovoj nachin jas kreirav moja mapa, so Ekspozituri i Bankomati oznacheni so razlichni figuri, soglasno mestoto kade se naogjaat (latitude, longitude).

3. Docker, Azure...
So Heroku imav problem vo prethodnata domashna, gi izvrshiv site postapki, mi ja publikuvashe aplikacijata, no ne ja loadirashe soodvetno. Zatoa vo ovaa domashna kje koristam Docker, pa Azure.
Repo na Docker odkoga uspeshno napraviv kontejner pa image:
docker pull danielajdocker/dasapp:dasapp

https://hub.docker.com/layers/danielajdocker/dasapp/dasapp/images/sha256-219a0e457a437eba6a09e8d954c9e8ea3b29632a8d1b515285b782713c8fc26b?context=repo

https://dasapp.azurewebsites.net/

Uspeshen deploy, megjutoa ne ja chita aplikcijata povtorno...

(ima slika soodvetno za sekoj del vo folderot Sliki)