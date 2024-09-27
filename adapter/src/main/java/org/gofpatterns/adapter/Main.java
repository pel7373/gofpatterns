package org.gofpatterns.adapter;

import org.gofpatterns.adapter.adapter.EnglishToGermanTaskAdapter;
import org.gofpatterns.adapter.adapter.GermanToEnglishTaskAdapter;
import org.gofpatterns.adapter.adapter.TaskAdapter;
import org.gofpatterns.adapter.englishTask.Task;
import org.gofpatterns.adapter.englishTask.TaskImpl;
import org.gofpatterns.adapter.germanTask.Aufgabe;
import org.gofpatterns.adapter.germanTask.AufgabeImpl;

public class Main {
    public static void main(String[] args) {
        Aufgabe germanTask = new AufgabeImpl("german titel", "german description");
        TaskAdapter germanToEnglishTaskAdapter = new GermanToEnglishTaskAdapter(germanTask);
        Task englishTask = new TaskImpl();
        String englishTitle = germanToEnglishTaskAdapter.getTitle();
        englishTask.setTitle(englishTitle);
        String englishDescription = germanToEnglishTaskAdapter.getDescription();
        englishTask.setDescription(englishDescription);
        System.out.printf("English task: title = %s, description = %s\n", englishTask.getTitle(), englishTask.getDescription());


        Task englishTask2 = new TaskImpl("english title", "english description");
        TaskAdapter englishToGermanTaskAdapter = new EnglishToGermanTaskAdapter(englishTask2);
        Aufgabe germanTask2 = new AufgabeImpl();
        String germanTitle2 = englishToGermanTaskAdapter.getTitle();
        germanTask2.titelFestlegen(germanTitle2);
        String germanDescription2 = englishToGermanTaskAdapter.getDescription();
        germanTask2.beschreibungFestlegen(germanDescription2);
        System.out.printf("German task: titel = %s, beschreibung = %s\n", germanTask2.titelErhalten(), germanTask2.beschreibungAbrufen());
    }
}
