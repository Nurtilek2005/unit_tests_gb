package me.nsydykovich.contactbook.provider;

public interface ContactProvider {
    void load();

    void read();

    void write();

    void update();

    void remove();

    void clear();

    void save();
}
