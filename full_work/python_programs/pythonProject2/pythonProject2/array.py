from scipy.special import cbrt
#Find cubic root of 27 & 64 using cbrt() function
cb = cbrt([27, 64])
#print value of cb
print(cb)

from scipy.special import exp10
#define exp10 function and pass value in its
exp = exp10([1,10])
print(exp)

from scipy.special import comb
#find combinations of 5, 2 values using comb(N, k)
com = comb(5, 2, exact = False, repetition=True)
print(com)

from scipy.special import perm
#find permutation of 5, 2 using perm (N, k) function
per = perm(5, 2, exact = True)
print(per)

from scipy import linalg
import numpy as np
#define square matrix
two_d_array = np.array([ [4,5], [3,2] ])
#pass values to det() function
le=linalg.det( two_d_array )
print(le)