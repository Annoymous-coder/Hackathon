def remdup(l):
  output = []
  ch = 0
  for ch in l:
    if ch not in output:
      output.append(ch)
  return(output)    
