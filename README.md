Membership of a club is represented by an instance of the Membership class.
Each Membership object contains details of a person's name, and the month and year in which they joined the club.
All membership details are filled out when a Membership object is created.

The Club class is intended to store Membership objects in a
flexible-size collection.

A new Membership object is added to a Club object's collection
via the Club object's join method, which has the following
signature and description:

    /**
     * Add a new member to the club's collection of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)


The Club class also defines a method to return how many
members are in the club. It has the following signature and
description:

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()

The number of members corresponds to the number of Membership
objects currently stored in the flexible-size collection.


The Club class has been defined completely. 
It includes the following:
= A field to refer to a flexible-size collection object
= A no-arg constructor that sets up an appropriate flexible-size collection object to store Membership objects
= A full definition of the join method
= A full definition of the numberOfMembers method

