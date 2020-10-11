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
import numpy as np
from math import *

global from_x, from_y


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
    global y_0
    global x_0
    x_0, y_0 = -2, 2 #наша ооблась определения
    global a
    global b
    global d
    global N
    global y_n
    global pattern_x
    global pattern_y
    global graph
    global n

    global form_x, form_y
    print("Введите формулу для x")
    form_x = str(input())
    print("Введите формулу для y")
    form_y = str(input())



    print("Введите значения следующих параметров:\nДиаметр разбиения ")
    d = float(input())
    print("a ")
    a = float(input())
    print("b ")
    b = float(input())

    N = int(4 / d) #количесво ячеек в строке

    print("Сохранять? (0/1)")
    save = bool(int(input()))


    graph = {}
    pattern_x = np.ones((10, 10)) * np.array(range(1, 11)) * 0.1 * d - d / 20  # шабоны клеток с точками
    pattern_y = pattern_x.copy().transpose()
    n = 1  # номер ячейки

    y_n = y_0 #

    while(y_n > -y_0):        #
        x_n = x_0
        while(x_n < -x_0):
            s = set(np.unique(get_num(*formula(x_n + pattern_x, y_n - pattern_y))).astype('int32'))
            graph[n] = s
            x_n += d
            n += 1
        y_n -= d



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


main()
