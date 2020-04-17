package Structural.Bridge;

import java.util.List;

//like Color interface in shape 2
public interface Formatter {
    String format(String header, List<Detail> details);
}
