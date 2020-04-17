package Structural.Bridge;

import java.util.List;

//String for printing to screen,  can have an HtmlFormatter etc
public class PrintFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append(header);
        builder.append("\n");
        for (Detail detail : details) {
            builder.append(detail.getLabel());
            builder.append(":");
            builder.append(detail.getValue());
            builder.append("\n");
        }
        return builder.toString();
    }
}
