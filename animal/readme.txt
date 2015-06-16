TASK 2
Napisati klasu koja opisuje jednu životinju. Životinju opisuju sljedeći atributi:
 Atribut (private) koji opisuje ime životinje
 Atribut (private) koji opisuje da li je životinja aktivna danju ili noću
o Vrijednost 1 znači da je životinja aktivna danju
o Vrijednost 2 znači da je životinja aktivna noću
 Atribut (private) koji opisuje koliko je životinji potrebno vode
o Vrijednost 1 znači da je životinji potrebno malo vode o Vrijednost 2 znači da je životinji potrebno više vode
o Vrijednost 3 znači da je životinji potrebno mnogo vode
 Napraviti konstruktor koji inicijalizira ta tri atributa
Pored toga, sve te životinje dijele isto stanište. Stanište je potrebno predstaviti u istoj klasi kao i životinje,
tj. bez korištenja dodatnih klasa. To stanište je opisano sa dvije varijable:
 Da li je noć ili dan (private) koje je po default-u 1 o Vrijednost 1 znači da je dan
o Vrijednost 2 znači da je noć
 Koliko vode ima stanište (private) koje je po default-u 1
o Vrijednost 0 znači da stanište nema vode
o Vrijednost 1 znači da stanište posjeduje malo vode o Vrijednost 2 znači da stanište posjeduje više vode
o Vrijednost 3 znači da stanište posjeduje mnogo vode
Životinje imaju samo jednu metodu:
 Isprintati kakvo je trenutno stanje životinje
o Ukoliko doba dana odgovara životinji i ona ima dovoljno vode za sebe
 Isprintati“It’sfine.Theanimalisactiveandhaswater.” o Ukoliko doba dana odgovara, ali nema dovoljno vode
 Isprintati “The animal is active, but does not have enough water.” o Ukoliko doba dana ne odgovara, ali ima dovoljno vode
 Isprintati “The animal is not active, but has enough water.” o Ukoliko doba dana ne odgovara, niti ima dovoljno vode
 Isprintati “The animal is not active and it does not have enough water.” Postoji još jedna metoda koja utiče na stanište:
 Promijeni doba dana
o Ako je bila noć onda postaje dan (nakon poziva metode) o Ako je bio dan onda postaje noć (nakon poziva metode)
 Promijeni koliko vode trenutno ima (static set metoda)