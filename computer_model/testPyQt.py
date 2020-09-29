'''
Есть облать определения  (-2;2)
Формула перевода точек на плоскости в сетку

Она делает номер ячейки, в которой находится точки(xn yn)

клетка 0.5
от -2 до -1.5 берем 100 точек
расстояние 1/100 ???? что это

x = -2, y = 2
xn = x^2 + y^2 + a
yn = 2*x*y+b

Входят ли она в дапозон от -2 до 2

'''
from math import *
import sys
import numpy as np
import matplotlib.pyplot as plt
import os
import time
from tkinter.ttk import Combobox
import tkinter as tk
from tkinter import *

def get_num(x, y):
    y = np.where(x < -2, 3, y)
    x = np.where(x < -2, -3, x)


    y = np.where(x > 2, 3, y)
    x = np.where(x > 2, -3, x)

    x = np.where(y < -2, -3, x)
    y = np.where(y < -2, 3, y)

    x = np.where(y > 2, -3, x)
    y = np.where(y > 2, 3, y)

    i = ((y_0 - y) // d * N) + ((x - x_0) // d) + 1
    i = np.where(i < 0, 0, i)
    return i

def formula(x, y):
    return(eval(form_x), eval(form_y))

def main():
    if len(sys.argv) == 1:
        global y_0, x_0, form_y, form_x, a, b, d, N, y_n, pattern_x, pattern_y, graph, n
        global x_0
        x_0, y_0 = -2, 2 #наша ооблась определения
    

        form_x = str(num1.get())
        form_y = str(num2.get())
        d = float(numyint.get())
        a = float(numya.get())
        b = float(numyb.get())

        N = int(4 / d)


        graph = {}
        pattern_x = np.ones((10, 10)) * np.array(range(1, 11)) * 0.1 * d - d / 20
        pattern_y = pattern_x.copy().transpose()
        n = 1
        y_n = y_0
        while(y_n > -y_0):
            x_n = x_0
            while(x_n < -x_0):
                s = set(np.unique(get_num(*formula(x_n + pattern_x, y_n - pattern_y))).astype('int32'))
                graph[n] = s
                x_n += d
                n += 1
            y_n -= d


        print("Сохранять? (0/1)")
        save = bool(int(input()))
        if save:
            cntr = 0
            c = 1
            f = open('test.txt', 'w')
            f.write('a = {}, b = {}\n'.format(a, b))
            for k, v in graph.items():
                f.write(f'{k}: {v}\n')
                cntr += len(v)
                c += 1
            f.close()
            print("Количество рёбер: {}".format(cntr))
            print("Количество вершин: {}".format(c))
    else:
        try:
            time_all = np.float(sys.argv[1])
        except:
            raise Exception('Argument must be a number')

# функция выхода из программы
def quit():
    exit(0)

#Графический интерфейс
root = Tk()
root.geometry('800x400')
root.configure(bg = 'black')
root.title('Application')
root.resizable(False, False)
#Для уравнения
lbl = Label(root, text = "f(x,y)= ")
lbl.place(x = 0, y = 90, height = 30, width = 50)

lbl1 = Label(root, text = "Формула ")
lbl1.place(x = 0, y = 10, height = 30, width = 80)

lbl2 = Label(root, text = "Действие ")
lbl2.place(x = 400, y = 10, height = 30, width = 80)

lblx = Label(root, text = "Область определения ")
lblx.place(x = 0, y = 180, height = 30, width = 170)
lblx1 = Label(root, text = "x ")
lblx1.place(x = 0, y = 240, height = 30, width = 50)
lbly = Label(root, text = "y")
lbly.place(x = 0, y = 290, height = 30, width = 50)

lbla = Label(root, text = "a ")
lbla.place(x = 300, y = 240, height = 30, width = 50)
lblb = Label(root, text = "b ")
lblb.place(x = 300, y = 290, height = 30, width = 50)

lblint = Label(root, text = "Интервал ")
lblint.place(x = 500, y = 240, height = 30, width = 80)


#Для хн
num1 = tk.Entry(root)
num1.place(x = 55, y = 60, height = 30, width = 250)
num2 = tk.Entry(root)
num2.place(x = 55, y = 120, height = 30, width = 250)
#для ввода задания
numvvod = tk.Entry(root)
numvvod.place(x = 400, y = 60, height = 30, width = 350)
#область применения
numx = tk.Entry(root)
numx.place(x = 55, y = 240, height = 30, width = 50)
numy = tk.Entry(root)
numy.place(x = 55, y = 290, height = 30, width = 50)
numx2 = tk.Entry(root)
numx2.place(x = 120, y = 240, height = 30, width = 50)
numy2 = tk.Entry(root)
numy2.place(x = 120, y = 290, height = 30, width = 50)

numya = tk.Entry(root)
numya.place(x = 380, y = 240, height = 30, width = 50)
numyb = tk.Entry(root)
numyb.place(x = 380, y = 290, height = 30, width = 50)

numyint = tk.Entry(root)
numyint.place(x = 590, y = 240, height = 30, width = 50)

but1 = Button(root, text = 'Ввод', command = main)
but1.configure(bd = 1, font = ('Castellar',25), bg = 'gray')
but1.place(x = 450, y = 300, height = 50, width = 150)

but2 = Button(root, text = 'Выход', command = quit)
but2.configure(bd = 1, font = ('Castellar',25), bg = 'gray')
but2.place(x = 620, y = 300, height = 50, width = 150)

root.mainloop()
