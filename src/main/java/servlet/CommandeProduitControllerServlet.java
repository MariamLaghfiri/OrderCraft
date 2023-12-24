package servlet;

import java.io.IOException;
import java.util.List;

import dao.CommandeProduitDaoImplementation;
import dao.ICommandeProduitDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CommandeProduit;

public class CommandeProduitControllerServlet extends HttpServlet {
    private ICommandeProduitDao metier;

    @Override
    public void init() throws ServletException {
        metier = new CommandeProduitDaoImplementation();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String path = req.getServletPath();
        // List of commandesProduits
        if (path.equals("/CommandeProduit.do")) {
            List<CommandeProduit> commandesProduits = metier.showAllCommandeProduit();
            req.setAttribute("commandesProduits", commandesProduits);
            req.getRequestDispatcher("/CommandeProduit/commandeProduit.jsp").forward(req, res);
        }
        // Add commandeProduit
        else if (path.equals("/AjouterCommandeProduit.do")) {
            req.getRequestDispatcher("/CommandeProduit/ajouterCommandeProduit.jsp").forward(req, res);
        } else if (path.equals("/SaveCommandeProduit.do") && (req.getMethod().equals("POST"))) {
            String referenceCommande = req.getParameter("referenceCommande");
            int idProduit = Integer.parseInt(req.getParameter("idProduit"));
            int quantite = Integer.parseInt(req.getParameter("quantite"));
            double prixTotal = Double.parseDouble(req.getParameter("prixTotal"));

            CommandeProduit commandeProduit = new CommandeProduit(referenceCommande, idProduit, quantite, prixTotal);
            metier.ajouterCommandeProduit(commandeProduit);
            res.sendRedirect("CommandeProduit.do");
        }
        // Update commandeProduit
        else if (path.equals("/EditCommandeProduit.do")) {
            int id = Integer.parseInt(req.getParameter("id"));
            CommandeProduit commandeProduit = metier.getCommandeProduit(id);
            req.setAttribute("commandeProduit", commandeProduit);
            req.getRequestDispatcher("/CommandeProduit/updateCommandeProduit.jsp").forward(req, res);
        } else if (path.equals("/UpdateCommandeProduit.do") && (req.getMethod().equals("POST"))) {
            int id = Integer.parseInt(req.getParameter("id"));
            String referenceCommande = req.getParameter("referenceCommande");
            int idProduit = Integer.parseInt(req.getParameter("idProduit"));
            int quantite = Integer.parseInt(req.getParameter("quantite"));
            double prixTotal = Double.parseDouble(req.getParameter("prixTotal"));

            CommandeProduit commandeProduit = new CommandeProduit(referenceCommande, idProduit, quantite, prixTotal);
            metier.updateCommandeProduit(commandeProduit, id);
            res.sendRedirect("CommandeProduit.do");
        }
        // Delete commandeProduit
        else if (path.equals("/SupprimerCommandeProduit.do")) {
            int id = Integer.parseInt(req.getParameter("id"));
            metier.supprimerCommandeProduit(id);
            res.sendRedirect("CommandeProduit.do");
        }
        // Not Found
        else {
            req.getRequestDispatcher("/notFound.jsp").forward(req, res);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}
