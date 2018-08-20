package facade;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-20
 * Time: 오후 4:33
 */
public class Facade {

    private ComplexAudio complexAudio;
    private ComplexLight complexLight;
    private ComplexTV complexTV;

    public Facade() {
        this.complexAudio = new ComplexAudio();
        this.complexLight = new ComplexLight();
        this.complexTV = new ComplexTV();
    }

    // Methods of basic action
    public boolean switchOnTV() {
        complexTV.switchOn();
        return true;
    }

    public boolean switchOffTV() {
        complexTV.switchOff();
        return true;
    }

    public boolean brigtenLight() {
        complexLight.brighten();
        return true;
    }

    public boolean darkenLight() {
        complexLight.darken();
        return true;
    }

    public boolean runAudio() {
        complexAudio.run();
        return true;
    }

    public boolean stopAudio() {
        complexAudio.stop();
        return true;
    }

    public boolean forwardAudio() {
        complexAudio.forward();
        return true;
    }

    public boolean rewindAudio() {
        complexAudio.rewind();
        return true;
    }

    // Methods of getStatus
    public String getAudioStatus() {
        return complexAudio.getStatus().name();
    }

    public String getLightLightness() {
        return Integer.toString(complexLight.getLightness());
    }

    public String getTVStatus() {
        String out;
        out = complexTV.isSwitch() ? "On" : "Off";
        return out;
    }

    public String getAllStatus() {
        return String.format("Audio - Status : %s\nLight - Lightness : %s\nTV - Status : %s",
                getAudioStatus(), getLightLightness(), getTVStatus());
    }

    // * Important *
    // Methods of custom process
    public boolean customProcess1() {
        complexLight.brighten();
        complexLight.brighten();
        complexTV.switchOn();
        complexAudio.run();
        return true;
    }

    public boolean customProcess2() {
        complexLight.brighten();
        complexTV.switchOff();
        complexAudio.forward();
        return true;
    }

    public boolean customProcess3() {
        complexLight.darken();
        complexLight.darken();
        complexTV.switchOn();
        complexAudio.stop();
        return true;
    }
}
