package org.gofpatterns.template.savetofile;

public abstract class SaveToFile {
    public void saveToFile(String info) {
        String result = info + " " + addToFile();
        System.out.printf("This information was written to file: %s\n", result);
    }

    public abstract String addToFile();
}
