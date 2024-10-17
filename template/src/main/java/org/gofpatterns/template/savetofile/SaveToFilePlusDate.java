package org.gofpatterns.template.savetofile;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SaveToFilePlusDate extends SaveToFile{
    @Override
    public String addToFile() {
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(new java.util.Date());
    }
}
