# Thread States 


- NEW
- RUNNABLE
- RUNNING
- WAITING
- DEAD

new() : creates a NEW Thread   

start() : takes that Thread to RUNNABLE   

run() : takes the Thread from RUNNABLE to RUNNING based on your CPU state    

and wait() or sleep() : will take a thread from :   
- RUNNING -> WAITING  
- RUNNABLE -> WAITING

notify() : takes a thread from WAITING to RUNNABLE and not RUNNING directly

stop() : takes a thread from RUNNABLE or RUNNING to DEAD state. But stop() is depricated and its not a good practice  
to stop threads. It hampers the stability of the system.