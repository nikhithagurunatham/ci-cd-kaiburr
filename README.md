# CI/CD Kaiburr Assignment

This project implements a full-stack app with CI/CD, Kubernetes deployment, Prometheus + Grafana monitoring, and EFK logging.
 Project Structure
 1. Clone the repo
cmd:
git clone https://github.com/nikhithagurunatham/ci-cd-kaiburr.git
cd ci-cd-kaiburr
2. Build and push Docker images
cmd:
docker build -t ghcr.io/<your-username>/shell-task-backend ./backend
docker build -t ghcr.io/<your-username>/shell-task-frontend ./frontend
docker push ghcr.io/<your-username>/shell-task-backend
docker push ghcr.io/<your-username>/shell-task-frontend
3. Deploy to Kubernetes
edit:
kubectl apply -f k8s/backend-k8s.yaml
kubectl apply -f k8s/frontend-k8s.yaml
