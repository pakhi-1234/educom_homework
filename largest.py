a = [12, 0, 45, 65, 68, 98, 56, 77, 50, 99]

# "b" ta ke ami largest number dhore nicchi temporarily
b = a[0]

# for loop chalachi jate "a" array tar sub elements gulo ekta ekta kore bar korte pari
for c in a:
    if c > b:
        # ar bar bar check koracchi je c ta "b" er theke boro kina. 
        # Jodi b er theke boro hoi tahole "b" take update kore dicchi
        # erom kore jeta sob theke boro number, setai pore thakbe "b" er moddhe
        b = c
        
# tarpor last e "b" take print koracchi
print("The largest number is:", b)