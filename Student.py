from tkinter import *
root = Tk()
root.title("Shri Bhaghubhai Maftlal Polytechnic")
root.geometry("300x200") 
frame=Frame(root)
frame.grid()
name_label=Label(root,text="Name:")
name_label.grid(row=0,column=0,pady=5)
name_entry=Entry(root)
name_entry.grid(row=0,column=0,pady=0)
roll_no_label=Label(root,text="Roll no")
roll_no_label.grid(row=1,column=1,pady=5)
roll_no_entry=Entry(root)
roll_no_entry.grid(row=1,column=1,pady=5)
sap_id_label=Label(root,text="Sap ID:")
sap_id_label.grid(row=2,column=0,pady=5)
sap_id_entry=Entry(root)
sap_id_entry.grid(row=2,column=1,pady=5)
contact_label=Label(root,text="Contact:")
contact_label.grid(row=3,column=0,pady=5)
contact_entry=Entry(root)
contact_entry.grid(row=3,column=1,pady=5)
email_label=Label(root,text="Email ID:")
email_entry=Entry(root)
email_entry.grid(row=4,column=1,pady=5)
def submit():
	second_window()
	submit_button=Button(root,text="Submit",command=submit)
	submit_button.grid(row=5,column=0,padx=20,pady=5)

root.mainloop()