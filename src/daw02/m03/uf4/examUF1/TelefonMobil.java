package m03.uf4.examUF1;

public class TelefonMobil extends Dispositiu{

    private boolean gps, acelerometre;
    private String sistemaOperatiu, tecnComunicacions;
    
    public TelefonMobil(String marca, String model, double preuBase, boolean gps, boolean acelerometre,
            String sistemaOperatiu, String tecnComunicacions) {
        super(marca, model, preuBase);
        this.gps = gps;
        this.acelerometre = acelerometre;
        this.sistemaOperatiu = sistemaOperatiu;
        this.tecnComunicacions = tecnComunicacions;
    }

    // public TelefonMobil(String marca, String model, double preuBase){
    //     super(marca, model, preuBase);
    // }

    public boolean isGps() {

        //if 

       // this.getPreuBase()
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isAcelerometre() {
        return acelerometre;
    }

    public void setAcelerometre(boolean acelerometre) {
        this.acelerometre = acelerometre;
    }

    public String getSistemaOperatiu() {
        return sistemaOperatiu;
    }

    public void setSistemaOperatiu(String sistemaOperatiu) {
        this.sistemaOperatiu = sistemaOperatiu;
    }

    public String getTecnComunicacions() {
        return tecnComunicacions;
    }

    public void setTecnComunicacions(String tecnComunicacions) {
        this.tecnComunicacions = tecnComunicacions;
    }

    public double precio(){

        double incremento;
       // double descuento;
        
        double descuento = preuBase - (preuBase % 30);

        //return preuBase % 50;

        //double descuento = preuBase;

        if(this.acelerometre == true && this.gps == true){
            incremento = preuBase - (descuento % 10);
        }else if(acelerometre == true && gps == false){
            incremento = preuBase - (descuento % 5);
        }else if(acelerometre == false && gps == true){
            incremento = preuBase - (descuento % 5);
        }else {
            incremento = preuBase;
            return incremento;
        }
        return incremento;
    }
    @Override
    public String toString() {

        String txt = null;
        if(acelerometre == true  && gps == true){
            txt = "El telefón móbil te acelerometre, en te gps y " + sistemaOperatiu + ", com a sistema opetatiu y te com a tecnologia de comunicacions + " + tecnComunicacions;
        }else if(acelerometre == false  && gps == false){
            txt = "El telefón móbil no en te acelerometre i no en te gps y " + sistemaOperatiu + ", com a sistema opetatiu y te com a tecnologia de comunicacions + " + tecnComunicacions;
        }else if(acelerometre == false  && gps == true){
            txt = "El telefón móbil no en te acelerometre si en te gps y " + sistemaOperatiu + ", com a sistema opetatiu y te com a tecnologia de comunicacions + " + tecnComunicacions;            
        }else if(acelerometre == true  && gps == false){
            txt = "El telefón móbil te acelerometre pero no en te gps y " + sistemaOperatiu + ", com a sistema opetatiu y te com a tecnologia de comunicacions + " + tecnComunicacions;
        }
        return txt;
    }
}

