# K-armed Bandit

A decision problem where an agent iteratively selects from a list of fixed choices when the properties of each choice is not fully known at the time of action.

It is a problem in Reinforcement Learning that is a prime example of the exploration-exploitation tradeoff dilemma.

The objective of this problem is to maximize the expected sum of total rewards over an arbritary time period that is dependant on a unknown or partially known stationary probablity distrubtion based on the action that was selected.

In a k-armed bandit problem, each of the k actions has an expected or mean reward given when that particular action has been selected, we can call this the _value_ of that action.

$$q_*(a) \doteq \mathbb{E}[R_t \mid A_t = a].$$
