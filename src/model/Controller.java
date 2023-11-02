package model;

public class Controller {

	private User[] users;
	private PlaneTicket[] planeTickets;

	public Controller() {

		this.users = new User[15];
		this.planeTickets = new PlaneTicket[10];

	}

	public String showUserList() {

		String usersRegistered = "";

		for (int i = 0; i < users.length; i++) {

			if (users[i] != null) {

				usersRegistered += "\n" + (i + 1) + ". " + users[i].getFullName();

			}

		}

		return usersRegistered;

	}

	public String showPlaneTickets() {

		String planeTicketsRegistered = "";

		for (int i = 0; i < planeTickets.length; i++) {

			if (planeTickets[i] != null) {

				planeTicketsRegistered += "\n" + (i + 1) + ". " + planeTickets[i].getAirLineName() + " - "
						+ planeTickets[i].getFlightNumber();
			}

		}

		return planeTicketsRegistered;

	}

	public boolean registerUser(String fullName, String id) {

		for (int i = 0; i < users.length; i++) {
			if (users[i] == null) {

				users[i] = new User(fullName, id);
				return true;

			}

		}

		return false;
	}

	public boolean registerPlaneTicket(String airLineName, String flightNumber, double kmBetweenCities) {

		for (int i = 0; i < planeTickets.length; i++) {
			if (planeTickets[i] == null) {

				planeTickets[i] = new PlaneTicket(airLineName, flightNumber, kmBetweenCities);

				return true;
			}

		}

		return false;
	}

}
