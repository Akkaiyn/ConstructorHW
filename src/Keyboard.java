public class Keyboard {
    private boolean backlight;
    private boolean nomericKeyboard;
    private String type;

    public Keyboard(){}

    public Keyboard(boolean backlight, boolean nomericKeyboard, String type) {
        this.backlight = backlight;
        this.nomericKeyboard = nomericKeyboard;
        this.type = type;
    }

    public boolean isBacklight() {
        return backlight;
    }

    public void setBacklight(boolean backlight) {
        this.backlight = backlight;
    }

    public boolean isNomericKeyboard() {
        return nomericKeyboard;
    }

    public void setNomericKeyboard(boolean nomericKeyboard) {
        this.nomericKeyboard = nomericKeyboard;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
