#           Find the occurences at each level for all the root elements, incase they dont exist , we can skip their execution    
# Assignment 1: (1,2,5, - Root
#                   (5,8,9, - Level 1
#                       (8,7,1, - Level 2
#                           (5,1) - Level 3
#                               ))) 
# Expected :
#               1
#                 -
#                   1
#                     1
#               5
#                 5
#                   -
#                     5

from collections import defaultdict 

elem_level_count = defaultdict(lambda  : list())

def traverse_tuple(tup, level) :
    for elem in tup : 
        if isinstance(elem, tuple) :
            traverse_tuple(elem, level + 1)
        else : 
            if level >= len(elem_level_count[elem]) :
                elem_level_count[elem].append(1)
            else : 
                elem_level_count[elem][level] += 1


### Input Part : 
elements_tuple = (1, 2, 3, 4, (5, 3, 2, 3, 1, (1, 4, 2, 3, (4, 5, 23, 2), (1, 2, 3))))

### Output Part : 
traverse_tuple(elements_tuple, 0)

## Printing the output : 
for elem in elements_tuple : 
    if len(elem_level_count[elem]) > 1 :
        step = ""
        for i, times in enumerate(elem_level_count[elem]) :
            print(step + (str(elem) + " ") * times)
            step += " " * (i + 1) 