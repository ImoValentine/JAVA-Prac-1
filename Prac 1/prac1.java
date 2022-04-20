def isTriangle(arg1, arg2, arg3):
	if (arg1 + arg2 > arg3) and (arg2 + arg3 > arg1) and (arg3 + arg1 > arg2):
		return True
	else:
		return False
def isIsosceles(arg1, arg2, arg3):
	if (arg1 == arg2) or (arg2 == arg3) or (arg1 == arg3):
		return True
	else:
		return False
def isEquilateral(arg1, arg2, arg3):
	if (arg1 == arg2) and (arg2 == arg3):
		return True
	else:
		return False
def isRightAngled(arg1, arg2, arg3):
	if (arg1*arg1 == arg2*arg2 +arg3*arg3) or (arg2*arg2 == arg1*arg1 +arg2*arg2) or (arg3*arg3 == arg1*arg1 +arg2*arg2):
		return True
	else:
		return False
s1 = float(raw_input("Please enter a side of the figure : "))
s2 = float(raw_input("Please enter a side of the figure : "))
s3 = float(raw_input("Please enter a side of the figure : "))

if isTriangle(s1,s2,s3):
	flag = False
	if isIsosceles(s1,s2,s3):
		print "Isosceles triangle"
		flag = True
	if isEquilateral(s1,s2,s3):
		print "Equilateral triangle"
		flag = True
	if isRightAngled(s1,s2,s3):
		print "Right-angled triangle"
		flag = True
	if not flag:
		print "Scalene triangle"
else:
	print "Figure is not a triangle"prac1,py 
