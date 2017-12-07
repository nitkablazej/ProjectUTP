package beans;

import enums.Character;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controller")
@SessionScoped
public class Controller {

    private String text = "";
    private Character character = null;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String returnValue() {
        return "index2";
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public String chooseJanCharacter() {
        character = Character.JAN;
        return "completePersonalData";
    }

    public String chooseJedrzejCharacter() {
        character = Character.JEDRZEJ;
        return "completePersonalData";
    }
}