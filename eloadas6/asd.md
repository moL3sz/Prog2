interface mezok -> public static final
interface method -> public abstract

default -> kell implementacio

```java
interface TudUgatni{
   /*public static final */ String hang = "wau wau";
    public default String Ugat(){
        return TudUgatni.hang;
    }
}
```


## abstract vs interface
----
* felület + részleges megvalósítás
* interface sok ős, class csak 1
* abstract osztalyban lehet példányszintű mező
* interfaceben csak static a mezők;
* abstract osztalyoknak lehet konstruktora, interfacenek nem lehet
* abstract osztalyban lehet nem publikus rész is (jellemzően protected)
mivan akkor ha ugyanazt a methodod két interfacebol is öröklöm és mindkettőben default implementacio van?

```interfacenev.super.method```;

```java
class Kutya implements TudUgatni, AltalanosKutya{

    @Override
    public String Ugat(){
        return (AltalanosKutya|TudUgatni).super.Ugat();
    }
}
```

**Jó-e a ```default``` kulcso?**
*Design by Contract*
Az ember azt hinne hogy a methodus két féle részből áll, fej + törzs
Szerződes fejrész vagy különrész;
* Öndokumentáló megjegyzés
* **Assert!** ```assert(1 == 1)``` |  ```assert(1 == 2, error)```;

kivételt el lehet kapni, errort nem :(
Assert azért kell hogy megfogalmazzuk a szerződést!
Assert dinamikus check!
```bash
java -ga ...
```
Assert kikapcsolás



----
defaultba csak olyat szabad irni ami szerinted a szerződeshez kapcsolodik.

craftmanship - önképzés