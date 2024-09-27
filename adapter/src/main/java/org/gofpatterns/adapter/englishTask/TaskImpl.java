package org.gofpatterns.adapter.englishTask;

public class TaskImpl implements Task {
    private String title;
    private String description;

    public TaskImpl() {
    }

    public TaskImpl(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
