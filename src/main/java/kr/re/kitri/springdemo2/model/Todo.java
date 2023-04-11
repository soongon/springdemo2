package kr.re.kitri.springdemo2.model;

import lombok.Data;

public @Data class Todo {
    private int id;
    private String title;
    private boolean isCompleted;

    public Todo(int id, String title, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.isCompleted = isCompleted;
    }
}
