package Structural.Bridge;

import java.util.List;

//Can be a web printer, html printer etc
public abstract class Printer {
    public String print(Formatter formatter){
        return formatter.format(getHeader(), getDetails());
    }

    abstract protected List<Detail> getDetails();
    abstract protected String getHeader();
}
