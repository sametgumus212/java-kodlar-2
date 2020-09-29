class Node:
  def __init__(self,icerik=None):
    self.icerik=icerik
    self.ileri=None
  def __repr__(self):
    return self.icerik
class LinkedList_stack:
  def __init__(self):
    self.ust =None
    
  def isempty(self):
    if self.ust == None:
      return True
    else:
      return False
  def push(self,yen):
    yeni=Node(yen)
    if self.ust==None:
      self.ust=yeni           
    else:
      yeni.ileri=self.ust
      self.ust=yeni

  def pop(self):
    tmp=self.ust
    if self.isempty ():
      return None
    else:
      print("pop edilen :",self.ust.icerik)
      self.ust=self.ust.ileri
      tmp.ileri=None
  

  def sirali(self):
    sirali == true
    tmp=self.ust
    once=None
    while tmp.ileri is not None:
      once=tmp
      tmp=tmp.ileri
      if once.icerik > tmp.icerik:
        print("sirali değil")
        sirali == false
        break
      print("sirali")
      return sirali
  def goster(self):
    tmp=self.ust
    if self.isempty():
      print("stack boş")
    else:
      while(tmp!=None):
        print(tmp.icerik,"-->",end=" ")
        tmp=tmp.ileri
      return
