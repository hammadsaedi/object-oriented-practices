package Lab_Tasks.Lab_9.Task_2;

public class News {
    private String newsId;
    private String newsEditor;
    private String newsContent;
    
    public News(String newsId, String newsEditor, String newsContent) {
        this.newsId = newsId;
        this.newsEditor = newsEditor;
        this.newsContent = newsContent;
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }
    
    public String getNewsEditor() {
        return newsEditor;
    }
    
    public void setNewsEditor(String newsEditor) {
        this.newsEditor = newsEditor;
    }
    
    public String getNewsContent() {
        return newsContent;
    }
    
    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        News other = (News) obj;
        if (newsId == null) {
            if (other.newsId != null)
                return false;
        } else if (!newsId.equals(other.newsId))
            return false;
        if (newsEditor == null) {
            if (other.newsEditor != null)
                return false;
        } else if (!newsEditor.equals(other.newsEditor))
            return false;
        if (newsContent == null) {
            if (other.newsContent != null)
                return false;
        } else if (!newsContent.equals(other.newsContent))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "News [News ID: " + newsId + ", News Editor: " + newsEditor + ", News Content: " + newsContent + "]";
    }
}

