# Assignment 1: sort the users in a project based on their salary 
#               [list of projects] 
#               project = [list of users]
# project : id , name , users[]
# user : id , name , salary

# Expectation:
#               e.g. [ p1,p2,p3]
#                       p1{u1{salary:100},u2{salary:400}}, p2{u3{salary:2000}}
#               1. Sort only users with the project , retain the place for the project : [ p1{u2{salary:400},u1{salary:100}},p2{u3{salary:2000}}]
#               2. explode the projects & sort all users based on their salaries: [ p2{u3{salary:2000}},p2{u2{salary:400},u1{salary:100}}}]
#               3. create a dict with project id as key & value as project with its sorted users in it: {p2: [p2], p1: [p1]}


class Project:
    def __init__(self,id,name):
                                self.id = id
                                self.name = name
                                self.users = []
    def addUser(self , uid , usalary):
        self.users.append([uid , usalary])
         
class Users(Project):
    def __init__(self,id,name,salary,P):
        self.id = id
        self.name = name
        self.salary = salary
        P.addUser(self.id , self.salary)

p1 = Project("p1","Project 1")
u1 = Users("u1","User 1",510000,p1)
u2 = Users("u2","User 2",140000,p1)
u3 = Users("u3","User 3",470000,p1)
u4 = Users("u4","User 4",345000,p1)


p2 = Project("p2","Project 2")
u1 = Users("u1","User 1",740000,p2)
u2 = Users("u2","User 2",530000,p2)
u3 = Users("u3","User 3",615000,p2)
u4 = Users("u4","User 4",745000,p2)

p3 = Project("p3","Project 3")
u1 = Users("u1","User 1",320000,p3)
u2 = Users("u2","User 2",540000,p3)
u3 = Users("u3","User 3",610000,p3)
u4 = Users("u4","User 4",35000,p3)

p4 = Project("p4","Project 4")
u1 = Users("u1","User 1",740000,p4)
u2 = Users("u2","User 2",530000,p4)
u3 = Users("u3","User 3",515000,p4)
u4 = Users("u4","User 4",645000,p4)


def sort(p):
    i = 0
    j = 1
    flag = False
    while( not flag == True):
        flag = True    
        i=0
        j=1
    
        while (i<j and j<len(p.users)): 
       
            if (p.users[i])[1]>(p.users[j])[1]:
         
                temp0 = (p.users[i])[0]
                temp1 = (p.users[i])[1]
                (p.users[i])[0]= (p.users[j])[0] 
                (p.users[i])[1]= (p.users[j])[1] 
                (p.users[j])[0]= temp0
                (p.users[j])[1]= temp1 
            
                flag = False
            i+=1
            j+=1
    return p.users
result = {"key":[]}
result.clear()
result["p1"] = sort(p1)
result["p2"] = sort(p2)
result["p3"] = sort(p3)
result["p4"] = sort(p4)

print(result["p2"])