from functions import runcommand
import time 

ncount = 0 
print("unlocking emulator screen ...")
while True:
    rn = runcommand("adb shell input keyevent 82 ")
    if rn == 0 :
        print("Unlocked emulator screen")
        exit(0)
    if ncount > 10 :
        print("Failed to unlock emulator screen")
        exit(1)
    time.sleep(10)
    ncount = ncount + 1
