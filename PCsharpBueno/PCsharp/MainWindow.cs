using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build(); 
        treeview1.AppendColumn("Nombre", new CellRendererText(), "text", 0);
        treeview1.AppendColumn("Telefono", new CellRendererText(), "text", 1);
        ListStore listStore = new ListStore(typeof(String), typeof(String));

        treeview1.Model = listStore;

        listStore.AppendValues("Sergio", "657743299");
        listStore.AppendValues("Aaron", "689752247");
        editAction.Sensitive = false;
        vbox2.Visible = false;

        newAction.Activated += (sender, e) => {
            vbox2.Visible = true;
            treeview1.Sensitive = false;
        };

        editAction.Activated += (sender, e) => {
            vbox2.Visible = true;
            treeview1.Sensitive = false;
            treeview1.Selection.GetSelected(out TreeIter treeIter);
        };

        treeview1.Selection.Changed += (sender, e) =>
            editAction.Sensitive = treeview1.Selection.CountSelectedRows()>0;
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}
