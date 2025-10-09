package be.ucll.crafsmanship.observer;

import be.ucll.crafsmanship.observer.editor.Editor;
import be.ucll.crafsmanship.observer.listeners.EmailNotificationListener;
import be.ucll.crafsmanship.observer.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
