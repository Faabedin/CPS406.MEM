package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import javafx.util.StringConverter;

import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class MemberController implements Initializable
{
    @FXML
    private DatePicker dpDate;
    @FXML private TableView<Coach> tableView;
    @FXML private TableColumn<Coach, String> coachNameCol;
    @FXML private TableColumn<DatePicker, DayOfWeek> availCol;
    @FXML private TableColumn<DatePicker, DatePicker> dateCol;
    @FXML private TableColumn<Member, String> paidCol;



    public void disableDays(javafx.event.ActionEvent actionEvent)
    {
        Callback<DatePicker, DateCell> dayCellFactory = dp -> new DateCell()
        {
            @Override
            public void updateItem(LocalDate item, boolean empty)
            {
                super.updateItem(item, empty);

                if(item.isBefore(LocalDate.now()) || item.isAfter(LocalDate.now().plusYears(1)) ||
                        item.getDayOfWeek() != DayOfWeek.FRIDAY)

                {
                    setStyle("-fx-background-color: #ffc0cb; -fx-text-fill: darkgray;");
                    setDisable(true);
                }
            }
        };
        dpDate.setDayCellFactory(dayCellFactory);
        //dpDate.setPromptText("dd/MM/yyyy");
        dpDate.setValue(LocalDate.now());

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        coachNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        availCol.setCellValueFactory(new PropertyValueFactory<>("className"));
        paidCol.setCellValueFactory(new PropertyValueFactory<>("paid"));

        //load data
        tableView.setItems(getCoaches());
       // tableView.setItems(getMembers());
    }

    public ObservableList<Coach> getCoaches()
    {
        ObservableList<Coach> coach = FXCollections.observableArrayList();
        coach.add(new Coach("Larry", "Friday"));
        coach.add(new Coach("John", "Friday"));

        return coach;

    }

    public ObservableList<Member> getMembers() {
        ObservableList<Member> member = FXCollections.observableArrayList();
        member.add(new Member("Larry", true));

        return member;
    }

}