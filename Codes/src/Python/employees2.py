class Project:
    def __init__(self,pid,pname,users) :
        self.pid=id
        self.pname=pname
        self.users=users
    #def trans():

    
                
class Employee:
    
    def __init__(self,id,name,sal,degn,per) :
        self.id=id
        self.name=name
        self.sal=sal
        self.degn=degn
        self.per=per

    def check_utilize(self):
        self.count_per=0
        
        for k in self.per:
            self.count_per+=self.per[k]
            if(self.count_per>100):
                msg='OVER UTILIZED'
                
            elif(self.count_per<50):
                msg='UNDER UTILIZED'
                
            else:
                msg=""
        print("Total Utilization=",self.count_per,msg)
        
p1=Project('a',"UPI",[1,3,2])
p2=Project('b',"Bhim",[1,4])
p3=Project('c',"URCS",[3,4])

emp1=Employee(1,"Aniket",2000,"Data Analyst",{'a':50,'b':30})
emp2=Employee(2,"Anshika",6000,"Business Analyst",{'a':40})
emp3=Employee(3,"Divya",4000,"System Engineer",{'a':30,'c':40})
emp4=Employee(4,"Ravi",3500,"Developer",{'b':45,'c':60})



print("Emp id|","Emp Name|","Salary|","Degn|","Performance per project|")
print(emp1.id,'|',emp1.name,'|',emp1.sal,'|',emp1.degn,'|',emp1.per)
emp1.check_utilize()

print(emp2.id,'|',emp2.name,'|',emp2.sal,'|',emp2.degn,'|',emp2.per)
emp2.check_utilize()

print(emp3.id,'|',emp3.name,'|',emp3.sal,'|',emp3.degn,'|',emp3.per)
emp3.check_utilize()
print(emp4.id,'|',emp4.name,'|',emp4.sal,'|',emp4.degn,'|',emp4.per)
emp4.check_utilize()