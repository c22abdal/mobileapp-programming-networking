
# Rapport

I denna uppgift har jag lärt mig att använda data från json filer och URL:r och hur *RecyclerView* skapas och vad är dess fördelar.
Tyvärr även om jag skrev kod som kändes rätt, ingenting vissas på skärmen, jag trodde att det är pga att programmet inte läser data från filer eller URL.

- Tillåta internet.
```
 <uses-permission android:name="android.permission.INTERNET" />
```

- Skapar Mountain Klass För att kunna sätta atteributes.
```
public class Mountain {
    private String name;
    private String location;
    private int height;

    public Mountain(){
        name = "No name";
        location = "No Location";
        height = -1;
    }

    public Mountain(String name, String location, int height){
        this.name = name;
        this.location = location;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getHeight() {
        return height;
    }
}```


Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
