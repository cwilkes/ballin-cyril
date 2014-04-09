General thoughts about elevator problem

1. goal is to deliver people from floor to floor in a "minimal" amount of time
2. "minimal" can mean a lot of things, need to define a cost function
3. this is a simulation so need to provide a method to step through it and tell the state of the world
4. provide a way to read in an input file of the number of elevators and number of floors and then
   each line is a moment in time and a button press (up/down) followed by the floor number
5. divide the problem into the interface that the "users" will interact with and then an algorithm to do the picking
