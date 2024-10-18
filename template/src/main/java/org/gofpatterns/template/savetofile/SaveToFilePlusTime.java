package org.gofpatterns.template.savetofile;

import java.text.Format;
import java.text.SimpleDateFormat;

public class SaveToFilePlusTime extends SaveToFile{
    @Override
    public String addToFile() {
        Format formatter = new SimpleDateFormat("HH:mm:ss");
        return formatter.format(new java.util.Date());
    }
}
