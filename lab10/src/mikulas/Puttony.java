package mikulas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Puttony implements AjandekCsomag{

    private List<Ajandék> ajandekok = new ArrayList<>();

    private  String cimzett;

    public Puttony( String cimzett) {
        this.cimzett = cimzett;
    }


    public void setAjandekok(List<Ajandék> ajandekok) {
        this.ajandekok.addAll(ajandekok);
    }

    public String getCimzett() {
        return cimzett;
    }

    public void setCimzett(String cimzett) {
        this.cimzett = cimzett;
    }
    @Override
    public int összÉrték() {
        int s = 0;
        for(Ajandék a : ajandekok){
            s += a.ar;
        }
        return s;
    }

    @Override
    public int nehezekSzama(double t) {
        int c = 0;
        for(Ajandék a : ajandekok){
            if(a.tomeg > t){
                c++;
            }
        }
        return c;
    }

    @Override
    public Collection<Gyerekjáték> gyerekjatekok() {
        List<Gyerekjáték> gyerekeknek = new ArrayList<>();

        for(Ajandék a: ajandekok){
            if(a.getClass().equals(Gyerekjáték.class)){
                gyerekeknek.add((Gyerekjáték) a);
            }
        }
        return gyerekeknek;
    }

    @Override
    public String toString() {
        String ret = this.cimzett + "\n\n";
        for(Ajandék a : ajandekok){
            ret += a.toString() + "\n";
        }
        return  ret;
    }
}
