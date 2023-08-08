package view;

import presenter.Presenter;

public interface View {
    void printAnswer(String text);
    void start();
    void setPresenter(Presenter presenter);
    String scan();
}