public class KonversiSuhu {

    float celcius;

    public KonversiSuhu(float param) {
        celcius = param;
    }

    void toKelvin() {
        System.out.println("Kelvin : " + (celcius + 273.15));
    }

    void toFahrenheit() {
        System.out.println("Fahrenheit : " + ((celcius * 1.8) + 32));
    }

    void toRankine() {
        System.out.println("Rankine : " + ((celcius * 1.8) + 491.67));
    }

    void toDelisle() {
        System.out.println("Delisle : " + ((100 - celcius) * 1.5));
    }

    void toNewton() {
        System.out.println("Newton : " + (celcius * 33 / 100));
    }

    void toReamur() {
        System.out.println("Reaumur : " + (celcius * 0.8));
    }

    void toRomer() {
        System.out.println("Romer : " + ((celcius * 21 / 40) + 7.5));
    }
}
