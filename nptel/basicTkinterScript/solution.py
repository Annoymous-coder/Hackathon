#Using tkinter module, write a Python GUI program 
#to create a label and change the label font style to your own choice.

import tkinter as tk
parent = tk.Tk()
parent.title("-Welcome to Python tkinter")
my_label = tk.Label(parent, text="Hello", font=("Arial Bold", 70))
my_label.grid(column=0, row=0)
parent.mainloop()