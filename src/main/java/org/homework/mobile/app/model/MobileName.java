package org.homework.mobile.app.model;

public enum MobileName {
    // category and priority
    Apple("mobile", "high"),
    Oppo("smartphone", "average"),
    Samsung("mobile", "short"),
    Xiaomi("smart watch", "best");

    private String category;
    private String priority;
    // конструктор MobileName
    MobileName(String category, String priority) {
        this.category = category;
        this.priority = priority;
    }
    // работа с Get и Set enum
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

}

