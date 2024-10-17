package org.gofpatterns.template;

import org.gofpatterns.template.savetofile.SaveToFile;
import org.gofpatterns.template.savetofile.SaveToFilePlusDate;
import org.gofpatterns.template.savetofile.SaveToFilePlusTime;

public class Main {
    public static void main(String[] args) {
        SaveToFile saveToFile = new SaveToFilePlusDate();
        saveToFile.saveToFile("Info");

        saveToFile = new SaveToFilePlusTime();
        saveToFile.saveToFile("Info");
    }
}