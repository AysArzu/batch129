package mini_projects.hastane;

public class Case {
    private String actualCase;
    private boolean urgency;

    public Case() {
    }

    public Case(String actualCase) {
        this.actualCase = actualCase;
    }

    public Case(String actualCase, boolean urgency) {
        this.actualCase = actualCase;
        this.urgency = urgency;
    }

    public String getActualCase() {
        return actualCase;
    }

    public void setActualCase(String actualCase) {
        this.actualCase = actualCase;
    }

    public boolean isUrgency() {
        return urgency;
    }

    public void setUrgency(boolean urgency) {
        this.urgency = urgency;
    }
}