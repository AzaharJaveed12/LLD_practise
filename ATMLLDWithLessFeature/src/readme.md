# ATM Machine Low-Level-Design

## Encalsulation :
```agsl
Hide the things which users dosen't have permission to perform operations.

ATMMachine :
    user should perform only :
        1. insertCard
        2. enterPin
        3. withdrawAmount
        
    user should not see :
        1. Balance present in ATM
        2. can't eject card by himself. (ejectCard)
        3. readAndvalidatePin
        4. dispenseAmount
        5. setCurrentState
        
    if he can see this states then he can directly call withdraw amount and dispense the amount.
    which is not a good design strategy.
    
    To atchive encapsulation I have created an ATMMachineAPI which will be exposed to external world.
```

### POLYMORPHISM : Existing in different forms.
```agsl
    We atchive polymorphism by making ATMMachine apears as a different object in different states.
    
    Example : 
        We noCardInserted and CardInserted state, we have same methods in both states by which we are able to make client
        feels like he is intracting with completly different object.
```

### ABSTRACTION : generalizing the things which have common behaviour.
```agsl
We have state as an abstraction example. we have all the methods in this state only
which are implemented in different class
```

## DESIGN PATTERN USED :
```agsl
1. State Design pattern

Future Scope :
    1. Factory design pattern to create different types of ATMMachines.
        (Deposite and withdraw machines)
    2. Observer design pattern to get the data customer typed.
    3. Command design pattern to make the buttons send different commands each time.
```