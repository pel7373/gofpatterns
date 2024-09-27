package org.gofpatterns.adapter.adapter;

import org.gofpatterns.adapter.englishTask.Task;

public class EnglishToGermanTaskAdapter implements TaskAdapter {

    private final Task englishTask;

    public EnglishToGermanTaskAdapter(Task englishTask) {
        this.englishTask = englishTask;
    }

    @Override
    public String getTitle() {
        return englishTask.getTitle();
    }

    @Override
    public void setTitle(String title) {
        englishTask.setTitle(title);
    }

    @Override
    public String getDescription() {
        return englishTask.getDescription();
    }

    @Override
    public void setDescription(String description) {
        englishTask.setDescription(description);
    }
}
