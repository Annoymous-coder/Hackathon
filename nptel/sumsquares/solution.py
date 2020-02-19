def sumsquare(l):
  listodd = []
  listeven = []
  suma = 0
  sumb = 0
  for i in l:
    if i%2==0:
      listeven.append(i)
    else:
      listodd.append(i)
  #print(listeven,listodd)    
  for i in listeven:
    suma = suma + i*i
  for j in listodd:
    sumb = sumb + j*j
  listans = [sumb,suma]
  return(listans)
