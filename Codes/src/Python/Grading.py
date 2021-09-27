# Assignment 1 : Gimme the list of all the students that have passed in a class with proper grading system.
#               e.g. if a student has 3 subjects : Math / Physics / Chemistry
#                    if he scores less than 50 % in two of those subjects he fails over all
#                    however if he fails in only 1 subject then he fails in just 1 subject, that should be considered 
#                    as re appear
# 
#               Expectations : 
#                           1. Get a list of students failing in more than 2 or more subjects i.e. overall performance of class
#                           2. Get a list of students failing in 1 subject only - i.e. re appearing student
#                           3. Calculate the overall class performance based on students passed - point #1
#                           4. Calculate the overall performance based on grading system, to showcase the %age of
#                              students falling under 
#                                       a. Distinction - 80 % 
#                                       b. First Division - 60 - 79 % 
#                                       c. Second Division - 50 - 59 %

num_students = int(input())
students = list()
passed = list()
distinction = list() 
first_div = list()
second_div = list()
re_appear = list()
failed = list()

for i in range(num_students) :
    roll_no = i + 1
    marks_list = list(map(int, input("Enter the marks for Physics, Chemistry and Mathematics : ").split()))
    count = 0 
    for marks in marks_list :
        if marks < 50 : 
            count += 1
    if count > 1 :
        failed.append(roll_no)
    elif count == 1 :
        re_appear.append(roll_no)
    else : 
        passed.append(roll_no)
        avg_marks = sum(marks_list)/3
        if ( avg_marks >= 80) :
            distinction.append(roll_no)
        elif (avg_marks >= 60) :
            first_div.append(roll_no)
        else : 
            second_div.append(roll_no)

print("Class Performance Details : ")
print("Students who have failed : ")
for stud in failed :
    print(stud, end="\t")
print("Students who will reappear : ")
for stud in re_appear : 
    print(stud, end="\t")
print()
print("Percentage of Students failed : ", (len(failed)/num_students) * 100)
print("Percentage of Students reappearing : ", (len(re_appear)/num_students) * 100)
print("Percentage of Students passed : ", (len(passed)/num_students) * 100)
print("Percentage of Students in Distinction : ", (len(distinction)/num_students) * 100)
print("Percentage of Students in First Division : ", (len(first_div)/num_students) * 100)
print("Percentage of Students in Second Division : ", (len(second_div)/num_students) * 100)